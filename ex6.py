import requests

url = 'https://www.sap.com/belgique/index.html'
r = requests.get(url)

r = r.text.replace("SAP","Odoo")

f= open("SAP.html","w+")
f.write(r)
