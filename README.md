# Test_Task
![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)

Тестовое задание на позицию джуниор разработчик.
Создать мобильное приложение для Android, которое будет отображать список последних объявлений с API Bybit.

## Описание

Мобильное приложение для Android, которое делает запрос на сервер, далее отображает список последних объявлений.
При клике на объявление, переходит по url на сайт с подробной информацией.

### Зависимости
![Kotlin](https://img.shields.io/badge/kotlin-%237F52FF.svg?style=for-the-badge&logo=kotlin&logoColor=white)
* Ktor version = "2.3.7"
* Dagger_Hilt =  "2.46.1"
* Jetpack Compose = "1.5.2"
* Coroutine

![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)
### Скриншоты

![home screen Test_task](https://github.com/SergeiBaz/Test_Task/blob/master/Screenshot_20240126_143932.png)
![home horizontal screen Test_task](https://github.com/SergeiBaz/Test_Task/blob/master/Screenshot_20240126_144013.png)
![go to URL](https://github.com/SergeiBaz/Test_Task/blob/master/Screenshot_20240126_144043.png)

### Архтитектура

* Clean Architecture(presentation and data)
Было использованно 2 слоя без Domain и UseCase, так как структура приложения на мой взгляд не сложная.
Логика каждого слоя изолирована друг от друга.
Так приложение создавалось в одном модуле для простоты.
* MVVM

### Структура проекта
Общая структура проекта:

`AndroidManifest.xml` — файл с описанием разрешений для приложения, указаниями файлов, отображения и т.д.

Папка `data`:
* `model` — папка, в которой находится модель для данных, которые будут отображаться  

* `repository` — папка, в которой находятся интерфейс и имплементация repository,

Папка `di`:
* В ней находятся классы для dependency injection(HttpClient, interfaceApi, repository)

Папка `network`:

* Тут находятся интерфейс для взаимодействия с вызовом в сеть с помощью Ktor

* `dto` — папка, в которой находится модель для данных, которые будут serialization из Json 

Папка `presentation`:

* `screens` — папка, в которой находятся composable fun,

* `viewModel` — папка, в которой находится viewModel и sealed interface UI состояния.
