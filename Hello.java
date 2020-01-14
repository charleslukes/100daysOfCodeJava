
// draw a pyramid 

public class Hello {
    public static void main(String[] args) {

        String container = "";
        int pyramidStart = 19;

        for (int i = 1; i <= 19; i++) {
            int next;

            for (int j = 1; j <= 37; j++) {
                if (j == pyramidStart) {
                    container += "*";
                    pyramidStart--;
                }
                if (i > 1) {
                    next = pyramidStart + 2;

                    for (int j2 = 1; j2 < i; j2++) {
                        if (j == next) {
                            if (j2 == 1) {
                                container += "*";
                            } else {
                                container += " *";

                            }
                        }
                    }
                }

                container += " ";
            }

            container += "\n";
        }

        System.out.println(container);
    }
}
