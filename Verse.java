public class Verse {
    public static void main(String[] args){
        String str = "Роняет лес багряный свой убор,\n" +
                    "Сребрит мороз увянувшее поле,\n" +
                    "Проглянет день как будто поневоле\n" +
                    "И скроется за край окружных гор.";

        char arrStr[] = str.toCharArray();
        int count = 0;
        char ch = 'о';
        for (int i=0; i<str.length(); i++){
            if (arrStr[i]==ch){
                count++;
            }
        }
        System.out.println("Количество повторений буквы 'о': "+count);
    }
}
