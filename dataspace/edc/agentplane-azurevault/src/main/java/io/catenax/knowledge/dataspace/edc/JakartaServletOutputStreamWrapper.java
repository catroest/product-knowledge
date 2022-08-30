package io.catenax.knowledge.dataspace.edc;

import java.io.IOException;

import javax.servlet.WriteListener;

import org.eclipse.dataspaceconnector.spi.monitor.Monitor;

public class JakartaServletOutputStreamWrapper extends javax.servlet.ServletOutputStream implements IJakartaWrapper<jakarta.servlet.ServletOutputStream> {
    
    jakarta.servlet.ServletOutputStream jakartaDelegate;
    Monitor monitor;

    public JakartaServletOutputStreamWrapper(jakarta.servlet.ServletOutputStream jakartaDelegate, Monitor monitor) {
        this.jakartaDelegate=jakartaDelegate;
        this.monitor=monitor;
    }

    @Override
    public jakarta.servlet.ServletOutputStream getDelegate() {
        return jakartaDelegate;
    }

    @Override
    public Monitor getMonitor() {
        return monitor;
    }

    @Override
    public boolean isReady() {
        return jakartaDelegate.isReady();
    }

    @Override
    public void setWriteListener(WriteListener writeListener) {
        // TODO Auto-generated method stub
    }

    @Override
    public void write(int b) throws IOException {
        jakartaDelegate.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        jakartaDelegate.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        jakartaDelegate.write(b, off, len);
    }

}
