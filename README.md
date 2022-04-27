Kritagya Kothari- 20BCE0556
# Introduction to Merkle Tree
Merkle Trees are a fundamental component of blockchains that supoort their functionality. They are used to encrypt blockchain data more efficiently and securely in bitcoin and other cryptocurrencies.

It is a mathematical data structure or a method of organizing data, made up of hash number of various data blocks of transactions performed in the Blockchain network. Basically, it acts as a summary of all the transactions. 

# Architecture of Merkle Tree
Merkle trees fundamentally are data structure trees where each non-leaf node is a hash of its respective child nodes.

The leaf nodes are the lowest tier of nodes in the tree. 
![image](https://user-images.githubusercontent.com/103498786/165562636-fccc4878-8047-40f5-a055-8e09e5442424.png)

Essentially, Merkle trees are a data structure that can take “n” number of hashes and represent it with a single hash.

Merkle Tree is an implementation of a Merkle binary hash tree where the leaves are signatures (hashes, digests, CRCs, etc.) of some underlying data structure that is not explicitly part of the tree.
 
The internal leaves of the tree are signatures of its two child nodes. If an internal node has only one child, the the signature of the child node is adopted ("promoted").

Instead, they can verify that a data chunk is consistent with the root hash by only checking a small subset of the hashes rather than the entire data set.

# Algorithm

- A Merkle tree is constructed by recursively hashing pairs of nodes until there is only one hash.
- If we have an odd number of transactions, the last transaction is duplicated.
- If any of the transaction is modified, the root hash changes and shows that one of the transaction has been modified. This is used in blockchain to verify that data isn’t modified in a block.

![image](https://user-images.githubusercontent.com/103498786/165565770-79aef635-a7d1-48b2-a64c-fb045573a8f6.png)


# References
1. https://blockonomi.com/merkle-tree/
2. https://www.youtube.com/watch?v=PraPZFMj6h8
3. https://github.com/goyalnikhil02/MerkleTree

