package game;

/**
 * Игровое поле.
 */
public class FieldBattle {
    private String[][] field;
    private int sizeField = 10;

    public FieldBattle() {
        field = new String[sizeField][sizeField];
        setWawe();
    }

    /**
     * Заполнение поля 'волнами'.
     */
    private void setWawe() {
        field[0][0] = " ";
        for (int x = 0; x < sizeField; x++) {
            for (int y = 0; y < sizeField; y++) {
                field[x][y] = "~";
            }
        }
    }

    /**
     * Вывод поля в консоль.
     */
    public void printField() {
        char j = 'a';
        System.out.print(" ");
        for (int i = 1; i <= sizeField; i++)
            System.out.print(" " + i);
        System.out.println("");
        for (int x = 0; x < sizeField; x++) {
            System.out.print((char) (j + x));
            for (int y = 0; y < sizeField; y++) {
                System.out.print(' ' + field[x][y]);
            }
            System.out.println("");
        }

    }
}

