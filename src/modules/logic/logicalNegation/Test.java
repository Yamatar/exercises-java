package modules.logic.logicalNegation;

import modules.defineFunctions.returnValue.App;

class Test {
    public static void main(String[] args) throws Exception{
        final var expected = "35";

        assert expected.equals(String.valueOf(App.getParentNamesTotalLength("Daenerys Targaryen")));
    }
}