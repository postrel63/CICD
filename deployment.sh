pid=`ps -ef | grep CICD | grep -v grep | awk -F " " '{print $2}'`

if [ $pid ]
then
        echo "실행중인 백엔드 프로세스 종료하는 중..."
        kill -9 $pid
else
        echo "실행중인 백엔드 프로세스가 없습니다."
fi

