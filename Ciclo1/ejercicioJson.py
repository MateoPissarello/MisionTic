import json
data = {
"cientifico": {
"nombre": "Alan Mathison Turing",
"edad": "41"
}
}
#serealizacion
with open("data_file.json", "w") as write_file:
    json.dump(data, write_file)
    #print(json_string)
#deserealizacion
with open("data_file.json", "r") as read_file:
    data = json.load(read_file)
print(data["cientifico"])