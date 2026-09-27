from flask import Flask, send_file
import os

app = Flask(__name__)

@app.route('/')
def home():
    # Menyajikan file index.html ke browser
    return send_file('index.html')

if __name__ == '__main__':
    print("Python Web Server berjalan di port 5000...")
    app.run(host='0.0.0.0', port=5000)
