package com.baeldung.quarkus_project.graal;

import com.oracle.svm.core.annotate.Substitute;
import com.oracle.svm.core.annotate.TargetClass;
import org.graalvm.nativeimage.ImageSingletons;
import org.graalvm.nativeimage.impl.HeapDumpSupport;

import java.io.IOException;

@TargetClass(className = "org.graalvm.nativeimage.VMRuntime")
final class Target_org_graalvm_nativeimage_VMRuntime
{
    @Substitute
    public static void dumpHeap(String outputFile, boolean live) throws IOException
    {
        System.out.println("Dump heap with unreachable objects");
        ImageSingletons.lookup(HeapDumpSupport.class).dumpHeap(outputFile, false);
    }
}
