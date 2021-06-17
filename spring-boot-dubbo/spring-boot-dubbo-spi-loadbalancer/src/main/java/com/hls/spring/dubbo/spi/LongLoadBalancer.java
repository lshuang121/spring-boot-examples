package com.hls.spring.dubbo.spi;


import org.apache.dubbo.common.URL;
import org.apache.dubbo.rpc.Invocation;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.RpcException;
import org.apache.dubbo.rpc.cluster.LoadBalance;

import java.util.List;

public class LongLoadBalancer implements LoadBalance {

  @Override
  public <T> Invoker<T> select(List<Invoker<T>> invokers, URL url, Invocation invocation) throws RpcException {
    System.out.println("LongLoadBalancer");
    return invokers.get(0);
  }
}
