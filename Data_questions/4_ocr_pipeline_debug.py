"""
Goal: This is a small OCR pipeline made up of a handful of classes. It should
read a sample image (a plain paragraph of printed text) and write clean,
readable OCR text out to a file, but right now it has 2 independent bugs in
it. Find and fix both.

You'll know you're done when:
    1. The output file shows up in the directory you pass to
       OCRPipeline(...), not somewhere else.
    2. The OCR result matches the paragraph in the image, with no missing
       or garbled text.

Steps:
    1. Run the script and read the printed output plus whatever ends up in
       the output directory.
    2. The 2 bugs are independent - fixing one won't fix the other.
    3. The sample image lives in Data_questions/images/dense_paragraph.png.
"""

import os
import pytesseract
from PIL import Image


class ImagePreprocessor:
    """Converts an image to grayscale before OCR."""

    def preprocess(self, image):
        return image.convert('L')


class OCREngine:
    """Thin wrapper around pytesseract so callers don't need its API."""

    # BUG: '--psm 8' tells Tesseract to treat the whole image as a single
    # word. That's the wrong page segmentation mode for a multi-line
    # paragraph and produces garbage output. Look up Tesseract's --psm
    # options and pick one meant for a uniform block of text.
    def extract_text(self, image, config='--psm 8'):
        return pytesseract.image_to_string(image, config=config)


class ResultWriter:
    """Writes OCR output to a text file inside output_dir."""

    def __init__(self, output_dir='Data_questions/ocr_output'):
        self.output_dir = output_dir
        os.makedirs(self.output_dir, exist_ok=True)

    def write(self, filename, text):
        path = os.path.join(self.output_dir, filename)
        with open(path, 'w') as f:
            f.write(text)
        return path


class TimestampedResultWriter(ResultWriter):
    """A ResultWriter that also prints a running count after each write."""

    def __init__(self, output_dir):
        # BUG: output_dir and write_count are set before calling
        # super().__init__(), and the parent's __init__() then runs with
        # its own default argument, resetting self.output_dir back to
        # 'Data_questions/ocr_output' regardless of what was passed in here.
        self.output_dir = output_dir
        self.write_count = 0
        super().__init__()

    def write(self, filename, text):
        path = super().write(filename, text)
        self.write_count += 1
        print(f"  wrote {filename} ({self.write_count} file(s) so far) -> {path}")
        return path


class OCRPipeline:
    """Loads an image, preprocesses it, runs OCR, and writes the result."""

    def __init__(self, output_dir='Data_questions/ocr_output'):
        self.preprocessor = ImagePreprocessor()
        self.ocr_engine = OCREngine()
        self.writer = TimestampedResultWriter(output_dir)

    def run(self, image_path, output_filename):
        image = Image.open(image_path)
        processed = self.preprocessor.preprocess(image)
        text = self.ocr_engine.extract_text(processed)
        self.writer.write(output_filename, text)
        return text


if __name__ == '__main__':
    pipeline = OCRPipeline(output_dir='Data_questions/ocr_results')

    print("Dense paragraph result:")
    dense_text = pipeline.run(
        'Data_questions/images/dense_paragraph.png',
        'dense_paragraph.txt',
    )
    print(dense_text)
