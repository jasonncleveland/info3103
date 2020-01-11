# Assignment 1 Part A

Steps to retrieve the webpage from within UNB's network.
The following examples will retirive the page and store it locally as index.html

## curl

Command:

`curl -X GET https://info3103.cs.unb.ca/jclevel2/index.html -o index.html`

Output:
```
[jclevel2@gaea ~/info3103]$ curl -X GET https://info3103.cs.unb.ca/jclevel2/index.html -o index.html
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
100  1023  100  1023    0     0   3465      0 --:--:-- --:--:-- --:--:--  3515
```

## wget

Command:

`wget https://info3103.cs.unb.ca/jclevel2/index.html`

Output:
```
[jclevel2@gaea ~/info3103]$ wget https://info3103.cs.unb.ca/jclevel2/index.html
--2020-01-11 19:22:34--  https://info3103.cs.unb.ca/jclevel2/index.html
Resolving info3103.cs.unb.ca (info3103.cs.unb.ca)... 131.202.240.29
Connecting to info3103.cs.unb.ca (info3103.cs.unb.ca)|131.202.240.29|:443... connected.
HTTP request sent, awaiting response... 200 OK
Length: 1023 [text/html]
Saving to: 'index.html'

100%[===========================================================================>] 1,023       --.-K/s   in 0s

2020-01-11 19:22:34 (23.5 MB/s) - 'index.html' saved [1023/1023]
```
