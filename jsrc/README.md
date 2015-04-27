Frontend
====

> 这是基于React, 使用FIS管理的一个项目。


## 安装fis-pure
```bash
npm install -g fis-pure
```

## 目录规范

pure自带了一个非常简单的目录规范

* 所有组件化的脚本、样式、图片均放在modules目录中，可以按照组件划分目录，非模块化的脚本放在lib目录中。
* page目录下的页面文件会发布到根目录，静态资源会发布到static目录。
* pure install获得的组件保存在components目录

## FIS运行过程

编译阶段

* parser
* preprocessor
* postprocessor
* lint
* test

打包阶段

* prepackager <- 这个是目标
* packager <- 这个是重点
* spriter
* postpackager



## 安装插件
```bash
npm install -g fis

npm install -g fis-parser-coffee-react

npm install -g fis-parser-coffee-script

npm install -g fis-parser-sass

npm install -g fis-parser-less

npm install -g fis-parser-jsx-react

npm install -g fis-parser-marked

npm install -g fis-parser-react

npm install -g fis-postprocessor-require-async

npm install -g fis-postprocessor-jswrapper

npm install -g fis-postpackager-autoload

npm install -g fis-postpackager-simple

npm install -g fis-pure
```