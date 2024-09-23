``` mermaid

classDiagram
    class MusicPlayer {
        <<interface>>
        +play()
        +pause()
        +stop()
    }

    class Phone {
        <<interface>>
        +makeCall(String number)
        +receiveCall(String caller)
    }

    class WebBrowser {
        <<interface>>
        +browse(String url)
        +addBookmark(String url)
    }

    class iPhone {
        -String model
        -String color
        +play()
        +pause()
        +stop()
        +makeCall(String number)
        +receiveCall(String caller)
        +browse(String url)
        +addBookmark(String url)
    }

    iPhone ..|> MusicPlayer
    iPhone ..|> Phone
    iPhone ..|> WebBrowser

```