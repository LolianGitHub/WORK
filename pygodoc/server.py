#!/usr/bin/env python3
# encoding: utf-8

"""
@author: blownhither@github
@license: Apache Licence
@time: 8/5/18 1:13 AM
"""
from flask import Flask, render_template, request

app = Flask(__name__)
_text_buf = ''

@app.route('/edit')
def front_page():
    return render_template('edit.html')


@app.route('/update', methods=['POST'])
def update():
    text = request.form['text']
    print('update', text)
    global _text_buf
    _text_buf = text
    return 'OK'


@app.route('/fetch', methods=['GET'])
def fetch():
    global _text_buf
    return _text_buf


if __name__ == '__main__':
    app.run(host='0.0.0.0', debug=True)
