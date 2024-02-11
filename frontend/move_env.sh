#!/bin/bash

# 서브모듈 폴더
SUBMODULE_FOLDER="secret"

# 서브모듈에서 .env 파일들을 프로젝트 루트로 이동
for env_file in $(find $SUBMODULE_FOLDER -type f -name '.env*'); do
    cp $env_file .
done