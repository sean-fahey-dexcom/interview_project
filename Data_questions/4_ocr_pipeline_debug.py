"""
Goal: This is a small OCR pipeline made up of a handful of classes. It should
read a sample image (a plain paragraph of printed text) and write clean,
readable OCR text out to a file, but right now it has 3 independent bugs in
it. Find and fix all three.

IMPORTANT: Save the output text to Data_questions/ocr_results. Don't save it to the
default output directory.

Steps:
    1. Run the script and read the printed output plus whatever ends up in
       the output directory.
    2. The 2 bugs are independent - fixing one won't fix the other.
    3. The sample image lives in Data_questions/images/dense_paragraph.png.
"""

import os
import pytesseract
from PIL import Image


DEFAULT_OUTPUT_DIR = '.'


class ImagePreprocessor:
    """Converts an image to grayscale before OCR."""

    def preprocess(self, image):
        return image.convert('L')


class OCREngine:
    """Thin wrapper around pytesseract so callers don't need its API."""

    def extract_text(self, image, config='--psm 8'):
        return pytesseract.image_to_string(image, config=config)


class ResultWriter:
    """Writes a single OCR output to a text file inside output_dir."""

    def __init__(self, output_dir=DEFAULT_OUTPUT_DIR):
        self.output_dir = output_dir
        os.makedirs(self.output_dir, exist_ok=True)

    def write(self, filename, text):
        path = os.path.join(self.output_dir, filename)
        with open(path, 'w') as f:
            f.write(text)
        return path


class TimestampedResultWriter(ResultWriter):
    """A ResultWriter class that also prints a running count after each write."""

    def __init__(self, output_dir=DEFAULT_OUTPUT_DIR):
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

    def __init__(self, output_dir=DEFAULT_OUTPUT_DIR):
        self.preprocessor = ImagePreprocessor()
        self.ocr_engine = OCREngine()
        self.writer = TimestampedResultWriter(output_dir)

    def run(self, image_path, output_filename):
        image = Image.open(image_path)
        processed = preprocessor.preprocess(image)
        text = ocr_engine.extract_text(processed)
        writer.write(output_filename, text)
        return text


if __name__ == '__main__':
    pipeline = OCRPipeline(output_dir='Data_questions/ocr_results')

    print("Dense paragraph result:")
    text = pipeline.run(
        'Data_questions/images/dense_paragraph.png',
        'dense_paragraph.txt',
    )
    print(text)
