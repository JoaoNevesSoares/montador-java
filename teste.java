public class teste {
    public static void main(String[] args) {
        
        
        int opcode = 0x48;
        int ni = 0x03;
        int xbpe = 0x01;
        int disp = 0x1036;
        int teste = ((opcode & 0xFC) <<24) + (ni<< 24) + (xbpe << 20)+ disp;//((opcode & 0xFC) <<16) + (ni<< 16) + (xbpe << 12)+ disp;
        System.out.println(teste);
    }
}
