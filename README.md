# Weather App

Weather App is an Android application that provides weather forecasts using a weather API.

## Архитектура

- **MVVM**: Архитектурный паттерн.
- **Room**: Для работы с локальной базой данных.
- **Retrofit**: Для работы с API.
- **Glide**: Для отображения изображений.
- **MVI (Model-View-Intent)**: Для управления состоянием приложения.
- **Decompose**: Для реализации компонентного подхода.
- **Dagger**: Для внедрения зависимостей.

## Функции

- Получение текущих данных о погоде.
- Прогноз погоды на 3 дня вперед.
- Удобный и современный интерфейс на основе Jetpack Compose.

## Настройка

### Инструкции по сборке проекта

1. В файл `gradle.properties` добавьте ваш API-ключ в следующем формате:
   ```properties
   apikey=YOUR_API_KEY
