#! /bin/sh
export JAVA_HOME="/data/work/software/jdk-12.0.1"
pathprefix="$( cd "$( dirname "$0"  )" && pwd  )"   
start(){
 now=`date "+%Y%m%d"`
 exec ${JAVA_HOME}/bin/java -jar -Dspring.profiles.active=Prod "$pathprefix"/build/libs/dfm2-JDDaoJia-0.0.1-SNAPSHOT.jar >>dfm2-JDDaoJia"$now".log 2>&1 &
}

stop(){
 ps -ef|grep java|grep dfm2-JDDaoJia |awk '{print $2}'|while read pid    
 do    
    kill -9 $pid
 done    
}    
    
case "$1" in    
    start)    
        start    
        ;;    
    stop)    
        stop    
        ;;      
    restart)    
        stop    
        start    
        ;;    
    *)    
        printf 'Usage: %s {start|stop|restart}\n' "$prog"    
        exit 1    
        ;;    
esac

