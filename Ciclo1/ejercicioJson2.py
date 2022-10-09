import json
from pprint import pprint
strjson = '''{
"boolean1": null,
"diccionario": {"papa": 2000, "arroz": 5000},
"intValue": 0, "myList": [],
"myList2":["info1", "info2"],
"littleboolean": false, "myEmptyList": null,
"text1": null, "text2": "hello", "value1": null,
"value2": null}'''

data = json.loads(strjson)
pprint(data)