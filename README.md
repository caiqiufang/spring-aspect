考虑到现有的分布式系统中的定时任务集群问题，现有的解决方案有两种

1. 使用分布式任务
2. 使用分布式锁，集群中抢到锁的执行定时任务，抢不到的则不执行（此方式可以使用aop 并使用注解的切入，降低对原系统的耦合）
注：使用redis 官方推荐的Redission 分布式锁实现，并封装了工具类集成springboot
