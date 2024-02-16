public class lesson_14_34 {
    //Оператор break в switch
    //Важной особенностью работы switch является то, что программа просто перепрыгивает на нужную строку (на нужный блок кода)
    //и затем выполняет все блоки кода до конца switch.
    //Не только тот блок кода, который соответствует значению внутри switch, а все блоки кода до конца switch.

    //Из прошлой задаче, при значении температуры 36, программа перейдет внутри switch на первый блок кода — первую строку,
    //и после ее выполнения просто будут выполняться остальные блоки кода.

    //Если вы хотите, чтобы в каждом случае выполнялся только один блок кода,
    //на который перепрыгнуло выполнение программы, вам после этого блока кода нужно написать оператор break;

    public static void main(String[] args) {
        int temperature = 36;

        switch(temperature)
        {
            case 36:
                System.out.println("Низкая");
                break;
            case 37:
                System.out.println("Нормальная");
                break;
            case 38:
                System.out.println("Высокая");
        }
    }
}