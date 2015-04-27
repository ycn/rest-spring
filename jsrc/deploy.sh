#!/bin/sh

if [ $# -ne 1 ]; then
    echo "Usage: $0 (local|test|prod)"
    exit
fi

ENV=$1

pure release --clean

if [ "${ENV}"x = "prod"x ]; then
    pure release -d ${ENV} --lint --domains --md5 --optimize --pack
else
    pure release -d ${ENV} --lint --domains --md5
fi