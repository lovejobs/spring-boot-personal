package com.lovejobs.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

import java.util.EventListener;

public class Server {

    public static void main(String[] args) throws InterruptedException {
        EventLoopGroup pgroup = new NioEventLoopGroup();
        EventLoopGroup cgroup = new NioEventLoopGroup();

        ServerBootstrap b = new ServerBootstrap();
        b.group(pgroup,cgroup).channel(NioServerSocketChannel.class)
                .option(ChannelOption.SO_BACKLOG,1024)
                .option(ChannelOption.SO_SNDBUF,32*1024)
                .option(ChannelOption.SO_RCVBUF,32*1024)
                .option(ChannelOption.SO_KEEPALIVE,true)
                .childHandler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel sc) throws Exception {
                        sc.pipeline().addLast(new ServerHandler());
                    }
                });
        ChannelFuture cf1 = b.bind(8888).sync();
        cf1.channel().closeFuture().sync();
        pgroup.shutdownGracefully();
        cgroup.shutdownGracefully();
    }
}
