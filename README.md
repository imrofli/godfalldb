Godfalldb:

As i grow tired of godfall this project goes with it. i am no longer updating it or hosting godfalldb.ch
anyone can feel free to apply to take it over.

V1 is pretty much like that for months.
i started a Version 2 as the old model seemed to restrictive.

V2 has a finished API already with Openapi in mind so clients can be generated already.
it also has an external config/properties and loads new datafiles from a data folder and archives them.
Versioning is also integrated for a switch to a non embedded DB.

for getting the data:
get UnrealPak tool
https://github.com/somethingcoolmustbehere/UnrealPakTool

UnrealPak "path to\Aperion-WindowsNoEditor.pak" -extract "path to folder to extract to"

file will be in Aperion\Content\Aperion\Data\Gameplay\SourceData

For V1:
--datasetPath path-to\source_data.json

mvn cmd to build for prod:
mvn clean install -Pproduction

check the small cmd in tools folder

for V2:

there is a yaml in openapi specs that describes the api and builds server and client endpoints in any language it supports.
the UI module is just "started" and has no working parts really.
API should be fully functional and has an Swagger UI with it to test. certain big data loads will take ages in swagger to load though
