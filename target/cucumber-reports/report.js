$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/PreencherInformacoesDadosSeguro.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 3,
  "name": "Automovel",
  "description": "",
  "id": "automovel",
  "keyword": "Funcionalidade"
});
formatter.before({
  "duration": 7487513600,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 6,
  "name": "que esteja na pagina de informacoes",
  "keyword": "Dado "
});
formatter.match({
  "location": "PreencherInformacoesSeguroSteps.que_esteja_na_pagina_de_informacoes()"
});
formatter.result({
  "duration": 3556316300,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Preencho a informacoes do seguro",
  "description": "",
  "id": "automovel;preencho-a-informacoes-do-seguro",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 8,
      "name": "@Seguro"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "preencher todos os campos de dados do seguro",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "valido a tela produto",
  "keyword": "E "
});
formatter.match({
  "location": "PreencherInformacoesSeguroSteps.preencher_todos_os_campos_de_dados_do_seguro()"
});
formatter.result({
  "duration": 193749500,
  "error_message": "org.openqa.selenium.ElementNotInteractableException: Element \u003cinput id\u003d\"firstname\" name\u003d\"First Name\" type\u003d\"text\"\u003e is not reachable by keyboard\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:48\u0027\nSystem info: host: \u0027NTB144576\u0027, ip: \u0027192.168.1.37\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_265\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 92.0.1, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20210922161155, moz:geckodriverVersion: 0.28.0, moz:headless: false, moz:processID: 8800, moz:profile: C:\\Users\\fesousa\\AppData\\Lo..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: de04b572-b860-4a84-bcd3-adab32bf4f9b\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:106)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy18.sendKeys(Unknown Source)\r\n\tat pageobjects.PreencherInformacoesDadosSeguro.preencherDadosSeguro(PreencherInformacoesDadosSeguro.java:62)\r\n\tat stepdefinitions.PreencherInformacoesSeguroSteps.preencher_todos_os_campos_de_dados_do_seguro(PreencherInformacoesSeguroSteps.java:42)\r\n\tat ✽.Quando preencher todos os campos de dados do seguro(Features/PreencherInformacoesDadosSeguro.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "PreencherInformacoesSeguroSteps.valido_a_tela_produto()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1781448000,
  "status": "passed"
});
});