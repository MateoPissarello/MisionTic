import json
from urllib3 import request
from pprint import pprint

response = request.get("https://jsonplaceholder.typicode.com/todos")
pendientes = json.loads(response.text)

pprint(pendientes)
