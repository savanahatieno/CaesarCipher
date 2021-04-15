# CaesarCipher
A java application to implement the Caesar Cipher substitution based encryption algorithm.
# Caesar-Cipher
Java implementation of the [Caesar cipher](https://en.wikipedia.org/wiki/Caesar_cipher).

The idea behind the Caesar Cipher is to replace each character in any given input by a fixed number of positions from their location within the alphabet. For instance, if we were to encrypt the plain text "abc" by an offset of 3, the resulting cipher text would be "def".

![Caesar Cipher](https://upload.wikimedia.org/wikipedia/commons/thumb/4/4a/Caesar_cipher_left_shift_of_3.svg/320px-Caesar_cipher_left_shift_of_3.svg.png)

Here's an example from the wikipedia article. Note that the cipher being used here is a left rotation of 3 places (or right rotation of 23 places):
```
Plain:    ABCDEFGHIJKLMNOPQRSTUVWXYZ
Cipher:   XYZABCDEFGHIJKLMNOPQRSTUVW

Plaintext:  THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG
Ciphertext: QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD
```
## Prerequisites
    1. java 11
    2. Gradle 4.10

## Usage

    1. Clone this repo
    2. Compile  `gradle compileJava`
    3. Run cd to cd build/classes/main then run `java App`


## Testing

   ```java
    gradle test
```

## License

Caesar Cipher was released under [MIT](LICENSE)

## Author
Agutu, Savanah
Email: agutusavanah0@gmail.com



