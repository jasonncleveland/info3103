#!/usr/bin/python3

import pymysql

from config import DB_HOST, DB_USER, DB_PASS, DB_NAME

if __name__ == '__main__':
    connection = pymysql.connect(host=DB_HOST, user=DB_USER, password=DB_PASS, db=DB_NAME)
    cursor = connection.cursor()

    result = cursor.execute('call getQuote')
    print('Content-Type: text/html')
    print('')
    print('<html>')
    print('<body>')
    if result > 0:
        print('<p>{0}</p>'.format(cursor.fetchone()[1]))
    else:
        print('<p>No quotes available</p>')
    print('</body>')
    print('</html>')
