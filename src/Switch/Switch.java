package Switch;

public class Switch {
    public static void main(String[] args) {
        char nilai = 'D';
        switch (nilai){
            case 'A':
                System.out.println("Mhs   : \"Terima kasih pak\"");
                System.out.println("Dosen : \"Selamat ya !!\"");
                break;
            case 'B':
                System.out.println("Mhs   : \"Kenapa ulun kada dapa A, pak?\"");
                System.out.println("Dosen : \"!@#$%\"");
                break;
            case 'c':
                System.out.println("Mhs   : \"Ulun turun pul pak ai,tugas pul jua\"");
                System.out.println("Dosen : \"Tapi bisa lah menjawab ujian\"");
                System.out.println("Mhs : \"Hihihi..\"");
                break;
            default:
                System.out.println("Mhs   : \"Ulun turun pul pak ai,tugas pul jua\"");
                System.out.println("Dosen : \"TBujur jua kah>\"");
                System.out.println("Dosen : \"*memeriksa berkas\"");
                System.out.println("Dosen : \"*menceleng\"");
                System.out.println("Mhs : \"Kabur..\"");
                break;
        }
    }
}
