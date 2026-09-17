@echo off
rmdir /s /q out 2>nul
mkdir out
javac -d out -sourcepath src src/ru/university/lab2/Main.java
jar cfm lab2.jar manifest.mf -C out .
echo Сборка завершена! Запуск программы: java -jar lab2.jar
pause
