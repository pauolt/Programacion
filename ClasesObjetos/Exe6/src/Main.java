class rectangulo {
    int base, altura;

    rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    void makeBigger() {
        base += 50;
        altura  += 50;
    }

    void makeSmaller() {
        base -= 50;
        altura -= 50;
    }

}



class posicion {
    int x, y;

    posicion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void moveLeft() {
        x -= 10;
    }

    void moveRight() {
        x += 10;
    }

    void moveUp() {
        y -= 10;
    }

    void moveDown() {
        y += 10;
    }

}

public class Main {
    public static void main(String[] args) {

       rectangulo rectangulo = new rectangulo(200, 100);
       posicion posicion = new posicion(500, 250);

        // crea tus objetos

        Lienzo lienzo = new Lienzo();

        lienzo.onKeyPressed(key -> {
            if (key == java.awt.event.KeyEvent.VK_LEFT) {
                // se ha pulasado la flecha LEFT, mueve un rectangulo a la izquierda
                posicion.moveLeft();
            }else if (key == java.awt.event.KeyEvent.VK_RIGHT) {
                posicion.moveRight();
                // se ha pulsado la tecla '+', haz un rectangulo mas grande
            } else if (key == java.awt.event.KeyEvent.VK_PLUS) {
                rectangulo.makeBigger();
                // se ha pulsado la tecla '+', haz un rectangulo mas grande
            } else if (key == java.awt.event.KeyEvent.VK_MINUS) {
                rectangulo.makeSmaller();
            } else if (key == java.awt.event.KeyEvent.VK_UP) {
                posicion.moveUp();
            } else if (key == java.awt.event.KeyEvent.VK_DOWN){
                posicion.moveDown();
            }
            // detecta la pulsacion de más teclas, y actua en consecuencia


            // en lugar de poner estos valores, pon los valores de tus objetos
            lienzo.draw(posicion.x, posicion.y, rectangulo.base, rectangulo.altura, java.awt.Color.BLUE);
        });



    }
}

class Lienzo extends javax.swing.JPanel {
    static class R {
        int x,y,w,h;
        java.awt.Color color;




        public R(int x, int y, int w, int h, java.awt.Color color) {
            this.x = x;
            this.y = y;
            this.w = w;
            this.h = h;
            this.color = color;
        }
    }




    interface KeyPressed {
        void Keypressed(int key);
    }
    KeyPressed k;
    private final java.util.List<R> rects = new java.util.ArrayList<>();




    public Lienzo() {
        javax.swing.JFrame ventana = new javax.swing.JFrame("Mover Rectángulos con Teclado");
        ventana.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 400);
        ventana.add(this);
        ventana.setVisible(true);
        setFocusable(true);
        addKeyListener(new java.awt.event.KeyListener() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent e) {}




            @Override
            public void keyPressed(java.awt.event.KeyEvent e) {
                k.Keypressed(e.getKeyCode());
                repaint();
            }




            @Override
            public void keyReleased(java.awt.event.KeyEvent e) {}
        });
    }




    public void draw(int x, int y, int base, int altura, java.awt.Color color) {
        rects.add(new R(x, y, base, altura, color));
    }




    @Override
    protected void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        rects.forEach(r -> {
            g.setColor(r.color);
            g.fillRect(r.x, r.y, r.w, r.h);
        });
        rects.clear();
    }




    void onKeyPressed(KeyPressed k) {
        this.k = k;
        k.Keypressed(-1);
    }
}
