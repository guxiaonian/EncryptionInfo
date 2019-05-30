<div align="center">

## EncryptionInfo

**`Android`加密库**

[![GitHub issues](https://img.shields.io/github/issues/guxiaonian/EncryptionInfo.svg)](https://github.com/guxiaonian/EncryptionInfo/issues)
[![GitHub forks](https://img.shields.io/github/forks/guxiaonian/EncryptionInfo.svg)](https://github.com/guxiaonian/EncryptionInfo/network)
[![GitHub stars](https://img.shields.io/github/stars/guxiaonian/EncryptionInfo.svg)](https://github.com/guxiaonian/EncryptionInfo/stargazers)
[![GitHub license](https://img.shields.io/github/license/guxiaonian/EncryptionInfo.svg)](http://www.apache.org/licenses/LICENSE-2.0)
[![Travis CI](https://travis-ci.org/guxiaonian/EncryptionInfo.svg?branch=master)](https://travis-ci.org/guxiaonian/EncryptionInfo)

</div>
<br>

Table of Contents
=================

   * [使用说明](#使用说明)
      * [Hash算法实现](#Hash算法实现)
      * [Hmac算法实现](#Hmac算法实现)
      * [对称加密算法实现](#对称加密算法实现)
      * [非对称加密算法实现](#非对称加密算法实现)


# 使用说明

### Hash算法实现

###### 代码示例

```java
HashHelper.encryptHashToString(shaType, data)
```

###### 参数设置

数据|数据类型|数据解释
---|-----|---
shaType|enum|Hash算法枚举
data |String|Hash的数据

### Hmac算法实现

###### 代码示例

```java
HmacHelper.encryptHmacToString(hmacType, data, key)
```

###### 参数设置

数据|数据类型|数据解释
---|-----|---
hmacType|enum|Hmac算法枚举
data |String|Hmac的数据
key |String|Hmac的密码

### 对称加密算法实现

###### 代码示例

```java
SymmetryHelper.decryptSymmetryToStringDefault(symmetryType, cipherSymmetryType, data, key);
```

###### 参数设置

数据|数据类型|数据解释
---|-----|---
symmetryType|enum|对称加密算法枚举
cipherSymmetryType |enum|对称加密算法的填充格式枚举
data |String|对称加密算法的数据
key |String|对称加密算法的密码

### 非对称加密算法实现

###### 代码示例

```java
AsymmetryHelper.encryptAsymmetryToHexString(asymmetryType, cipherAsymmetryType, data, key, true);

```

###### 参数设置

数据|数据类型|数据解释
---|-----|---
asymmetryType|enum|非对称加密算法枚举
cipherAsymmetryType |enum|非对称加密算法的填充格式枚举
data |String|非对称加密算法的数据
key |String|非对称加密算法的密码
true |boolean|是否是公钥

### 加密方法展示

```java
 Log.i(TAG, "MD5结果为:" + EncryptionHelper.getMd5Param(ENCRYPT_VALUE));
 Log.i(TAG, "SHA256结果为:" + EncryptionHelper.getSha256Param(ENCRYPT_VALUE));
 Log.i(TAG, "HmacMD5结果为:" + EncryptionHelper.getHmacMd5Param(ENCRYPT_VALUE, ENCRYPT_KEY));
 Log.i(TAG, "HmacSHA256结果为:" + EncryptionHelper.getHmacSha256Param(ENCRYPT_VALUE, ENCRYPT_KEY));
 String aesResult = EncryptionHelper.encryptAesParam(ENCRYPT_VALUE, AES_ENCRYPT_KEY);
 Log.i(TAG, "AES加密HexString结果为:" + aesResult);
 Log.i(TAG, "AES解密HexString结果为:" + EncryptionHelper.decryptAesParam(aesResult, AES_ENCRYPT_KEY));
 String rsaResult = EncryptionHelper.encryptRsaParamWithPublicKeyToHexString(ENCRYPT_VALUE, RSA_PUBLIC_KEY);
 Log.i(TAG, "RSA加密HexString结果为:" + rsaResult);
 Log.i(TAG, "RSA解密HexString结果为:" + EncryptionHelper.decryptHexStringRsaParamWithPrivateKey(rsaResult, RSA_PRIVATE_KEY));
 String rsa2Result = EncryptionHelper.encryptRsaParamWithPublicKey2ToBase64ToString(ENCRYPT_VALUE, RSA_PUBLIC_KEY);
 Log.i(TAG, "RSA加密Base64结果为:" + rsa2Result);
 Log.i(TAG, "RSA解密Base64结果为:" + EncryptionHelper.decryptBase64RsaParamWithPrivateKey2(rsa2Result, RSA_PRIVATE_KEY));
 byte[] aesBytes=EncryptionHelper.encryptAesParam(ENCRYPT_VALUE.getBytes(),AES_ENCRYPT_KEY.getBytes());
 byte[] result=EncryptionHelper.decryptAesParam(aesBytes,AES_ENCRYPT_KEY.getBytes());
 Log.i(TAG,"AES Bytes解密结果为:"+new String(result));
 byte[] rsaBytes=EncryptionHelper.encryptRsaParamBytes(ENCRYPT_VALUE.getBytes(), Base64Helper.decode(RSA_PUBLIC_KEY.getBytes()));
 byte[] rsaBytesResult=EncryptionHelper.decryptRsaParamBytes(rsaBytes,Base64Helper.decode(RSA_PRIVATE_KEY.getBytes()));
 Log.i(TAG,"RSA Bytes解密结果为:"+new String(rsaBytesResult));

```