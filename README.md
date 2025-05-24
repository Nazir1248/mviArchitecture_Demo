# 📚 Quote Generator App

A simple Android app built using **Jetpack Compose**, **Kotlin**, and the **MVI architecture pattern**. The app simulates loading random quotes and demonstrates a clean architectural setup with `Intent`, `State`, `ViewModel`, and `UseCase`.

---

## 🧠 Architecture

This project follows the **MVI (Model-View-Intent)** pattern and is structured into multiple clean layers:




com.example.mviarchitecture_demo/
│
├── data/
│ ├── model/ # Data classes (e.g. Quote)
│ └── repository/ # Simulated quote data source
│
├── domain/
│ └── usecase/ # Business logic (GetQuoteUseCase)
│
├── ui/
│ ├── intent/ # User actions (Intent)
│ ├── state/ # UI states
│ ├── view/ # Jetpack Compose screen
│ └── viewmodel/ # ViewModel (handles logic & state)
│
├── MainActivity.kt # Entry point












---

## 🛠️ Technologies Used

- ✅ Kotlin
- ✅ Jetpack Compose
- ✅ MVI Architecture (Intent + ViewState + ViewModel)
- ✅ Clean Architecture Principles
- ✅ Coroutines



---

## 🚀 Features

- Tap the button to load a quote
- Displays quote content and author
- Simulates loading and error handling
- Clean, maintainable code with separation of concerns

---

## 🧪 How to Run

1. Clone the repo:

   ```bash
   git clone https://github.com/Nazir1248/mviArchitecture_Demo.git
   cd mviArchitecture_Demo


🔄 Future Improvements
Integrate with a real API using Retrofit

Use Hilt for dependency injection

Add unit tests for ViewModel and UseCase

Dark mode support



🙌 Author
Nazir Ansari
Android Developer | AOSP Enthusiast | Embedded Systems Learner
Linkedin Profile - www.linkedin.com/in/nazir-ansari-a1a789220
