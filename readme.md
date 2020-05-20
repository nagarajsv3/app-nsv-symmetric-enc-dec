Symmetric encryption uses a single key known as private key or secret key to encrypt as well as decrypt sensitive information.

AES encryption operates in 2 different modes i.e. - ECB and CBC mode.

ECB Mode : ECB(Electronic Code Book) is the simplest encryption mode and does not require IV for encryption. The input plain text will be divided into blocks and each block will be encrypted with the key provided and hence identical plain text blocks are encrypted into identical cipher text blocks.           
CBC Mode : CBC mode is highly recommended and it requires IV to make each message unique. Hence, IV is used to randomize the encryption of each similar blocks. So any identical plain text blocks will be encrypted into disimmilar cipher text blocks. If no IV is entered then default will be used here for CBC mode and that defaults to a zero based byte[16].