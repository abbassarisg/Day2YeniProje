public class DaY2 {
    public static void main(String[] args) {
        System.out.println("deneme");
        System.out.println("Github tan pull olan");

         /*
    1-) git init ---> Local repo olusturmak icin yani gt ile klasörüümüzün içindeki dosyaları
    ilişkilendirmek icin kullanilir

    2-) git add . ---> Working space'den (yani yerel) dosyalarimi staging area'ya(yani commitlemek icin beklenen yer)
         gonderir.

         git status---> working space ve staging area daki durumu gorebiliriz

    3-) git commit -m "mesaj"  --->   Stageing area'dan commit stora dosyalarimi gondermek icin kullanilir
        (commit yani versiyon sürüm olusturmus olurum)

     4-) git push ---> Uzak repo'ya (yani remote -Github) göndermek icinkullandigimiz koddur

         YALNİZ GİT PUSH KOMUTUNU DİREK KULLANMAKA İSTESEK 1 KEZ

                  git remote add origin ===adress: gonderilecek adres===
                  git push -u origin master


        Not: Yukaridaki iki komutu tek seferde kullandiktan sonra ikinci commit'lerim icin sadece git push kullniriz


                              ===============Aslında==========
                              Dosyayı İlk defa göndereceğinizde
1) git init
2) git add .
3) git commit -m "versiyon_adi"
4) git remote add origin https://github.com/.....
5) git push -u origin master


Kodlarınızda değişiklik yaptığınızda tekrar güncellemek için
1) git add .
2) git commit -m "versiyon_adı"
3) git push

veya

İlk defa PUSH yapacaksanız bir projeyi ;

1 - Önce GitHub a gidip New Repository i oluşturun
2- Oluşturduğunuz repository de size verilen https://github.com/.............git   adresini kopyalayın


Şimdi IntelliJ ye gelip TERMINAL ı açın;

3- git init yazın
4- git add . yazın
5- git commit -m"first commit"  (first commit yerine  ilke versiyon, ilk ders veya istediğiniz bir şeyi yazın)
6- git branch -M main
7- git remote add origin https://github.com/.............git (yukarıda2. satırda kopyalağınız adresi buraya yapıştırın)
8- git push -u origin main


SONRASINDA Aynı PROJE için ;

her yeni eklediğiniz şeyden sonra GitHub'a yüklemek için

9- git add .
10 - git commit -m"YENI NUMARA VEYA YAZI YAZ"
11 - git push


hepsi bu kadar
         */
        
          
    }
}
