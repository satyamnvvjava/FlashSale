#https://myaccount.google.com/lesssecureapps?pli=1

generate cipher text for your password
java -cp ~/.m2/repository/org/jasypt/jasypt/1.9.2/jasypt-1.9.2.jar org.jasypt.intf.cli.JasyptPBEStringEncryptionCLI input=”Topsecret@123" password=dev-env-secret algorithm=PBEWITHMD5ANDDES

use the below command to run the jar file
#java -jar -Dapplication.properties=application.properties -Djasypt.encryptor.password=dev-env-secret FlashSaleEmailSrvc.jar