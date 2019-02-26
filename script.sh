
for i in 1 2 3 4 5
do
  echo "------------------"
  echo "Commit Number : $i"
  touch sample.txt
  echo "some data" >> sample.txt
  git add .
  git commit -m "minor changes" 
  git push origin master
done
