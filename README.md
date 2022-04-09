# Hello Clojure and Ackermann

## Execute 

```console 
$ clj -M -m hello.main
Ackermann( 4 ,  1 )
Execution error (StackOverflowError) at hello.main/acker$fn (main.clj:9).
null

Full report at:
/tmp/clojure-15372888795226057731.edn
```

Launch with larger stack size:

```console
$ clj -J-Xss1G -M -m hello.main
Ackermann( 4 ,  1 )
65533
```

## Create Uberjar

```console 
$ clj -T:build uber
$ java -Xss1G -jar target/hello-0.1.1-standalone.jar
Ackermann( 4 ,  1 )
65533
```
