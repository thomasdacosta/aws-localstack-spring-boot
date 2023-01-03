@echo off

echo ### Criando Segredos no AWS Secret Manager do LocalStack...
aws --endpoint http://localhost:4566 --profile localstack secretsmanager create-secret --name /secret/aws-localstack-spring-boot_localstack --description "Segredos de exemplo" --secret-string "{\"ts\":\"1\",\"apiKey\":\"f59dbe01285f1d360542b5c47a9516e3\",\"hash\":\"0ea6be79e04ac1b0400d65ffc11088f9\"}"
aws --endpoint http://localhost:4566 --profile localstack secretsmanager create-secret --name /secret/aws-localstack-spring-boot --description "Segredos de exemplo" --secret-string "{\"ts\":\"1\",\"apiKey\":\"f59dbe01285f1d360542b5c47a9516e3\",\"hash\":\"0ea6be79e04ac1b0400d65ffc11088f9\"}"
aws --endpoint http://localhost:4566 --profile localstack secretsmanager create-secret --name /secret/application --description "Segredos de exemplo" --secret-string "{\"ts\":\"1\",\"apiKey\":\"f59dbe01285f1d360542b5c47a9516e3\",\"hash\":\"0ea6be79e04ac1b0400d65ffc11088f9\"}"
aws --endpoint http://localhost:4566 --profile localstack secretsmanager create-secret --name /secret/application_localstack --description "Segredos de exemplo" --secret-string "{\"ts\":\"1\",\"apiKey\":\"f59dbe01285f1d360542b5c47a9516e3\",\"hash\":\"0ea6be79e04ac1b0400d65ffc11088f9\"}"

echo ### Criando Chaves no AWS Parameter Store do LocalStack...
aws --endpoint http://localhost:4566 --profile localstack ssm put-parameter --name "/config/aws-localstack-spring-boot_localstack/notification.name" --value "awsLocalstackNotification" --type String
aws --endpoint http://localhost:4566 --profile localstack ssm put-parameter --name "/config/aws-localstack-spring-boot_localstack/queue.name" --value "awsLocalstackQueue" --type String
aws --endpoint http://localhost:4566 --profile localstack ssm put-parameter --name "/config/aws-localstack-spring-boot_localstack/directory" --value "awslocalstack" --type String
aws --endpoint http://localhost:4566 --profile localstack ssm put-parameter --name "/config/aws-localstack-spring-boot_localstack/proxy.host" --value "localhost" --type String
aws --endpoint http://localhost:4566 --profile localstack ssm put-parameter --name "/config/aws-localstack-spring-boot_localstack/proxy.port" --value "8081" --type String
aws --endpoint http://localhost:4566 --profile localstack ssm put-parameter --name "/config/aws-localstack-spring-boot_localstack/proxy.enabled" --value "false" --type String

echo ### Criando Bucket no S3 do LocalStack...
aws --endpoint http://localhost:4566 --profile localstack s3 mb s3://awslocalstack

echo ### Copiando arquivos
aws --endpoint http://localhost:4566 --profile localstack s3 cp docker-compose.yml s3://awslocalstack

echo ### Listando arquivos...
aws --endpoint http://localhost:4566 --profile localstack s3 ls s3://awslocalstack


