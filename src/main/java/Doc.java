public class Doc {
    static int id = 0;
    private int docNumber;
    private DocType docType;
    Doc(DocType docType){
        this.docType = docType;
        id++;
        docNumber = id;
    }

    public DocType getDocType() {
        return docType;
    }

    public int getDocNumber() {
        return docNumber;
    }

    @Override
    public String toString() {
        return "Doc{" +
                "docNumber=" + docNumber +
                ", docType=" + docType +
                '}';
    }
}
