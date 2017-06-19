package sages.bootcamp.git;

/**
 * Created by Sysia on 2017-06-19.
 */
public class GitHello {

    public static void main(String[] args) {
        System.out.println ("Hello git!");
        System.out.println ("git add -u   dodaje do indexu pliki tracked\n" +
                "\n" +
                "git add -A   dodaje wszystko do indexu (tracked i untracked)\n" +

                "\n" +
                "git status   status plików\n" +
                "\n" +
                "git commit -m + \" \"    commit z komentarzem\n" +
                "\n" +
                "git commit          commit (otwiera vima)\n" +
                "\n" +
                "vim README.md        tworzy nowy plik (lub otwiera istniejacy) w edytorze vim : i zeby aedytować, esc + :wq wyjsc zapisac\n" +
                "\n" +
                "git diff hash1 hash2    róznica miedzy komitami - wystarczy podac pierwsze 5 znaków hashu\n" +
                "\n" +
                "git config --list     aktualna konfiguracja\n" +
                "\n" +
                "git config --local --list\n" +
                "\n" +
                "git config --global --list\n" +
                "\n" +
                "vim ~/.gitconfig    otwiera plik konfiguracyjny globalny (wszystkie repa danego usera)\n" +
                "\n" +
                "git remote   wyświetla liste zdalne repa\n" +
                "\n" +
                "git remote add origin + link     dodanie zdalnego repa o nazwie origin i adresie pod linkiem\n" +
                "\n" +
                "git remote -v       wyswietla linki do zdalnych rep\n" +
                "\n" +
                "git push -u origin master   - za peirwszym razem i potem domyslnie git push master pójdzie do origina (master to nazwa brancha)\n" +
                "\n" +
                "git push master  - potem\n" +
                "\n" +
                "ewentualnei za kazdym razem git push origin master\n" +
                "\n" +
                "ssh-keygen    - tworzenie klucza ssh");


    }

}
