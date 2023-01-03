@echo off

echo ### Criando Bucket no S3 do LocalStack...
aws --endpoint http://localhost:4566 --profile localstack s3 mb s3://awslocalstack

echo ### Copiando arquivos
aws --endpoint http://localhost:4566 --profile localstack s3 cp docker-compose.yml s3://awslocalstack

echo ### Listando arquivos...
aws --endpoint http://localhost:4566 --profile localstack s3 ls s3://awslocalstack


