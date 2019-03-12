class Test {
    public static void main(String[] args) throws Exception{
        final var expected = 35;

        assert expected == App.getParentNamesTotalLength("Daenerys Targaryen");
    }
}