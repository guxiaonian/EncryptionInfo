<div align="center">

## EncryptionInfo

**`Android`加密库**

[![Download](https://api.bintray.com/packages/guxiaonian/maven/encryption/images/download.svg) ](https://bintray.com/guxiaonian/maven/encryption/_latestVersion)
[![GitHub issues](https://img.shields.io/github/issues/guxiaonian/EncryptionInfo.svg)](https://github.com/guxiaonian/EncryptionInfo/issues)
[![GitHub forks](https://img.shields.io/github/forks/guxiaonian/EncryptionInfo.svg)](https://github.com/guxiaonian/EncryptionInfo/network)
[![GitHub stars](https://img.shields.io/github/stars/guxiaonian/EncryptionInfo.svg)](https://github.com/guxiaonian/EncryptionInfo/stargazers)
[![GitHub license](https://img.shields.io/github/license/guxiaonian/EncryptionInfo.svg)](http://www.apache.org/licenses/LICENSE-2.0)

</div>
<br>

Table of Contents
=================

   * [使用说明](#使用说明)
      * [Hash算法实现](#Hash算法实现)
      * [Hmac算法实现](#Hmac算法实现)
      * [对称加密算法实现](#对称加密算法实现)
      * [非对称加密算法实现](#非对称加密算法实现)


# 依赖

```gradle
implementation 'fairy.easy:encryptioninformation:{latest_version}'
```


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

### PBE加密算法实现

###### 代码示例

```java
PBEHelper.encryptPBE2HexString(hashType, data, key, salt, size);

```

###### 参数设置

数据|数据类型|数据解释
---|-----|---
hashType|enum|PBE加密算法枚举
data |String|PBE加密算法的数据
key |String|PBE加密算法的密码
salt |String|PBE加密算法的盐(消息双方规定的信息)
size |int|循环次数