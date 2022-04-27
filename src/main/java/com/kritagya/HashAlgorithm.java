package com.kritagya;

import org.bouncycastle.jcajce.provider.digest.Keccak;
import org.bouncycastle.util.encoders.Hex;

import java.nio.charset.StandardCharsets;

public class HashAlgorithm {

    public static String generateHash(String originalString) {
        Keccak.Digest256 digest256 = new Keccak.Digest256();
        byte[] hashedByteArray = digest256.digest(
                originalString.getBytes(StandardCharsets.UTF_8));
        return new String(Hex.encode(hashedByteArray));
    }

}