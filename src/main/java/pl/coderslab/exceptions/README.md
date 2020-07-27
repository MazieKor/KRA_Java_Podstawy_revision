![Coders-Lab-1920px-no-background](https://user-images.githubusercontent.com/152855/73064373-5ed69780-3ea1-11ea-8a71-3d370a5e7dd8.png)


## Zadanie 1 - rozwiązywane z wykładowcą

W pliku `Main01.java` została umieszczona metoda o sygnaturze `public static int factorial(int number)`
zwracająca silnię liczby naturalnej przekazanej w parametrze.
1. Zmodyfikuj kod tak, aby metoda zwracała wyjątek `IllegalArgumentException` 
w sytuacji gdy liczba `number` przekazana w parametrze będzie mniejsza od zera.
2. Zwróć uwagę czy jest to wyjątek kontrolowany czy niekontrolowany i dlaczego.
3. Przetestuj działanie programu wywołując metodę `factorial` z poprawnym i z niepoprawnym parametrem.
4. Przy wywołaniu metody `factorial` dodaj obsługę wyjątku `IllegalArgumentException`.
5. Przetestuj ponownie działanie programu.

## Zadanie 2

W pliku `Main02.java` umieszczony został program powodujący rzucenie wyjątku.
1. Uruchom program i zaobserwuj jaki wyjątek został rzucony.
2. Dodaj do kodu obsługę odpowiedniego wyjątku i uruchom ponownie program.
3. Zwróć uwagę czy jest to wyjątek kontrolowany czy niekontrolowany i dlaczego.

## Zadanie 3

W pliku `Main03.java` umieszczony został program powodujący rzucenie wyjątku.
1. Uruchom program i zaobserwuj jaki wyjątek został rzucony.
2. Zmodyfikuj kod tak, aby zabezpieczyć go przed rzuceniem wyjątku - należy sprawić aby w tym miejscu ten wyjątek nie był rzucany.


## Zadanie 4

W pliku `Main04.java` znajduje się program z obsługą dwóch wyjątków.

1. Uruchom program i zaobserwuj jaki wyjątek został zwrócony.
2. Usuń komentarz i popraw kod tak, aby dodatkowy wyjątek z komentarza był poprawnie obsługiwany.
1. Uruchom ponownie program i zaobserwuj jaki wyjątek został zwrócony?

## Zadanie 5

W pliku `Main05.java` znajduje się program, który zwraca wyjątek.
1. Uruchom program i zaobserwuj jaki wyjątek został zwrócony.
2. Dodaj do kodu obsługę odpowiedniego wyjątku.
3. Dodaj do kodu sekcję, która wykona się niezależnie od tego czy wyjątek zostanie rzucony czy nie.
4. Przetestuj działanie programu wywołując metodę `parseInt` z poprawnym i z niepoprawnym parametrem.

## Zadanie 6

W pliku `Main06.java` została umieszczona metoda o sygnaturze `public static int divide (int a, int b)`.

1. Uzupełnij ciało metody tak, aby wykonała dzielenie parametru `a` przez `b` i zwróciła całkowitą cześć wyniku dzielenia.
2. Wywołaj metodę `divide` przekazując parametr `b` o wartość `0` i zaobserwuj jaki wyjątek zostanie zwrócony po uruchomieniu programu.
3. Zmodyfikuj kod tak, aby metoda `divide` zwracała wyjątek `IllegalArgumentException` w sytuacji gdy parametr `b` będzie równy `0`.
4. Uruchom ponownie program i zaobserwuj jaki wyjątek zostanie zwrócony.
5. W metodzie `main` dodaj obsługę wyjątku `IllegalArgumentException`.
6. Przetestuj działanie programu przekazując do metody `divide` poprawny i niepoprawny parametr `b`.
