@echo off
REM Limpiar y crear directorios
if exist lib (
    del /Q lib\*.jar
) else (
    mkdir lib
)

if not exist bin (
    mkdir bin
)

REM Lista de dependencias
setlocal enabledelayedexpansion
set DEPENDENCIAS=^
org/jetbrains/kotlin/kotlin-stdlib/1.4.32/kotlin-stdlib-1.4.32.jar;^
org/jetbrains/kotlin/kotlin-stdlib-common/1.4.32/kotlin-stdlib-common-1.4.32.jar;^
org/jetbrains/annotations/13.0/annotations-13.0.jar;^
javax/servlet/javax.servlet-api/3.1.0/javax.servlet-api-3.1.0.jar;^
org/slf4j/slf4j-api/1.7.30/slf4j-api-1.7.30.jar;^
org/slf4j/slf4j-simple/1.7.30/slf4j-simple-1.7.30.jar;^
org/eclipse/jetty/jetty-server/9.4.40.v20210413/jetty-server-9.4.40.v20210413.jar;^
org/eclipse/jetty/jetty-http/9.4.40.v20210413/jetty-http-9.4.40.v20210413.jar;^
org/eclipse/jetty/jetty-io/9.4.40.v20210413/jetty-io-9.4.40.v20210413.jar;^
org/eclipse/jetty/jetty-util/9.4.40.v20210413/jetty-util-9.4.40.v20210413.jar;^
org/eclipse/jetty/jetty-webapp/9.4.40.v20210413/jetty-webapp-9.4.40.v20210413.jar;^
org/eclipse/jetty/jetty-servlet/9.4.40.v20210413/jetty-servlet-9.4.40.v20210413.jar;^
org/eclipse/jetty/jetty-security/9.4.40.v20210413/jetty-security-9.4.40.v20210413.jar;^
org/eclipse/jetty/jetty-util-ajax/9.4.40.v20210413/jetty-util-ajax-9.4.40.v20210413.jar;^
org/eclipse/jetty/jetty-xml/9.4.40.v20210413/jetty-xml-9.4.40.v20210413.jar;^
org/eclipse/jetty/websocket/websocket-api/9.4.40.v20210413/websocket-api-9.4.40.v20210413.jar;^
org/eclipse/jetty/websocket/websocket-client/9.4.40.v20210413/websocket-client-9.4.40.v20210413.jar;^
org/eclipse/jetty/websocket/websocket-common/9.4.40.v20210413/websocket-common-9.4.40.v20210413.jar;^
org/eclipse/jetty/websocket/websocket-server/9.4.40.v20210413/websocket-server-9.4.40.v20210413.jar;^
org/eclipse/jetty/websocket/websocket-servlet/9.4.40.v20210413/websocket-servlet-9.4.40.v20210413.jar;^
io/javalin/javalin/3.13.13/javalin-3.13.13.jar;^
com/fasterxml/jackson/core/jackson-databind/2.10.5/jackson-databind-2.10.5.jar;^
com/fasterxml/jackson/core/jackson-core/2.10.5/jackson-core-2.10.5.jar;^
com/fasterxml/jackson/core/jackson-annotations/2.10.5/jackson-annotations-2.10.5.jar

echo === Descargando dependencias ===
for %%D in (%DEPENDENCIAS%) do (
    set "URL=https://repo1.maven.org/maven2/%%D"
    for %%F in (%%D) do (
        set "FILENAME=%%~nxF"
    )
    if not exist lib\!FILENAME! (
        echo Descargando !FILENAME!
        curl -s -L "!URL!" -o lib\!FILENAME!
        if not exist lib\!FILENAME! (
            echo Error al descargar !FILENAME!
        )
    )
)

echo === Compilando ===
javac -cp ".;lib\*" -d bin src\Main.java
if errorlevel 1 (
    echo Error al compilar el código Java.
    exit /b 1
)

echo === Ejecutando ===
java -cp ".;lib\*;bin" Main
