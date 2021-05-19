from json import dumps
import requests
import time

def main():

    """Hangouts Chat incoming webhook quickstart."""
    url = 'https://chat.googleapis.com/v1/spaces/AAAAN5KCSYQ/messages?key=AIzaSyDdI0hCZtE6vySjMm-WEfRq3CPzqKqqsHI&token=u-V_qX3FJsJri3OTRCOfc786OoGdW8MylB1zBWOfglg%3D'
    
    
    response = requests.get('http://localhost:8080/getlist')
    li = response.json()
    string = ''
    
    for i in li:
        string += str(i)+'\n'

    
    bot_message = {
        'text' : string}

    requests.post(url, data=dumps(bot_message))
    
if __name__ == '__main__':
    day = time.gmtime()[3]
    while(True):
        
        time.sleep(30)
        # print("no")
        if time.gmtime()[3] != day:
            day = time.gmtime()[3]
            # print("yes")
            main()