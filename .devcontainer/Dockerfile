FROM ubuntu:24.04

ENV DEBIAN_FRONTEND=noninteractive
ENV PIP_NO_CACHE_DIR=1
ENV VIRTUAL_ENV=/opt/venv
ENV PATH="/opt/venv/bin:${PATH}"

RUN apt-get update \
    && apt-get install -y --no-install-recommends \
        ca-certificates \
        curl \
        git \
        python3 \
        python3-pip \
        python3-venv \
        tesseract-ocr \
        tesseract-ocr-eng \
    && rm -rf /var/lib/apt/lists/*

COPY requirements.txt /tmp/requirements.txt
RUN python3 -m venv ${VIRTUAL_ENV} \
    && ${VIRTUAL_ENV}/bin/python -m pip install --upgrade pip setuptools wheel \
    && grep -Evi '^(pip|setuptools|wheel)([[:space:]]|==|>=|<=|~=|!=|>|<|$)' /tmp/requirements.txt > /tmp/requirements.runtime.txt \
    && ${VIRTUAL_ENV}/bin/pip install -r /tmp/requirements.runtime.txt \
    && ${VIRTUAL_ENV}/bin/python -m pip install --upgrade pip setuptools wheel \
    && rm -f /tmp/requirements.txt /tmp/requirements.runtime.txt
