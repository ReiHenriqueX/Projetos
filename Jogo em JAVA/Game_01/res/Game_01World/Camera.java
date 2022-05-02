
package Game_01World;

public class Camera {
    
    
    public static int x = 0;
    public static int y = 0;

    public static int getX() {
        return x;
    }

    public static void setX(int x) {
        Camera.x = x;
    }

    public static int getY() {
        return y;
    }

    public static void setY(int y) {
        Camera.y = y;
    }
    
    
    public static int clamp(int Atual, int Min, int Max){
        
        if (Atual < Min) {
            
            Atual = Min;
            
        }
        
        if(Atual > Max){
            
            Atual = Max;
            
        }
        
        return Atual;
    }
    
}
