package org.automation;

import org.codetemplates.AccessControls;

public class Scenarios {
    public static void main(String[] args) {

        AccessControls accessControls = new AccessControls();
//        accessControls.samplePrivateMethod("input1");
        accessControls.samplePublicMethod("input1");
//        accessControls.sampleProtectedMethod("input1");
//        accessControls.sampleDefaultMethod("input1");

    }

    class TestAccessControls{
        public static void main(String[] args) {
            AccessControls accessControls = new AccessControls();

            accessControls.publicVariable = 100;
//            accessControls.protectedVariable = 200;
//            accessControls.defaultVariable = 300;
            // accessControls.privateVariable = 400;

//            accessControls.samplePrivateMethod("input1");
            accessControls.samplePublicMethod("input1");
//            accessControls.sampleProtectedMethod("input1");
//            accessControls.sampleDefaultMethod("input1");
        }
    }
}
